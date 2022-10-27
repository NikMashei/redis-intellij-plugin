package dev.mashei.redisplugin.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import java.util.function.Consumer
import java.util.function.Supplier
import javax.swing.Icon

open class RedisAction(
    dynamicText: Supplier<String>,
    dynamicDescription: Supplier<String>,
    icon: Icon?
) : AnAction(dynamicText, dynamicDescription, icon) {
    lateinit var actionEventConsumer: Consumer<AnActionEvent>

    override fun actionPerformed(actionEvent: AnActionEvent) {
        actionEventConsumer.accept(actionEvent)
    }
}