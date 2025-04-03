package io.github.erwanosouf.archunitsurefirebug;

import org.junit.jupiter.api.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(importOptions = ImportOption.DoNotIncludeTests.class)
class ArchUnitSurefireBugTest {

	@ArchTest
	public static final ArchRule thisTestUsingArchTestFieldShouldRun = classes()
			.should().be(ArchUnitSurefireBug.class);

	@ArchTest
	public static void thisTestUsingArchTestMethodShouldRun(JavaClasses classes) {
		ArchRule rule = classes().should().be(ArchUnitSurefireBug.class);

		rule.check(classes);
	}

	@Test
	void thisStandardTestShouldRun() {
		JavaClasses classes = new ClassFileImporter().importClasses(ArchUnitSurefireBug.class);
		ArchRule rule = classes().should().be(ArchUnitSurefireBug.class);

		rule.check(classes);
	}


}