package actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloAction : AnAction() {

    override fun actionPerformed(event: AnActionEvent) {
        val inputName = Messages.showInputDialog(event.project, "Input your name please", "Input dialog", null)
        println("Input name: $inputName")
    }

}