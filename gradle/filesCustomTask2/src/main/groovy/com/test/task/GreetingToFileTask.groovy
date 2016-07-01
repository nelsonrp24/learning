package com.test.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class GreetingToFileTask extends DefaultTask {
    
    @TaskAction
    def greet() {
        def file = new File("${project.greeting.destination}")
	println "This is greeter: ${project.greeting.greeter}"
        file.parentFile.mkdirs()
        file.write "${project.greeting.message}"
    }
}

