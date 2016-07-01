package com.test.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import com.test.task.*


class GreetingPlugin implements Plugin<Project> {
	@Override
	public void apply (Project project) {
		project.extensions.create("greeting", GreetingToFileTaskExtension)
		project.task("greet", type: GreetingToFileTask)
	}
}

