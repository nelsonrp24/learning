import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

println "Working on custom task in build script"

class SampleTask2 extends DefaultTask {

        String systemName = "MachineName"
        String systemGroup = "SystemGroup"

        @TaskAction
        def action1() {
                println "System is "+systemName+" and group is "+systemGroup
        }


        @TaskAction()
        def action2() {
                println "Adding multiple actions for refactoring"

        }

}
