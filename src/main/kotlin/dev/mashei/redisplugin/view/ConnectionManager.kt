package dev.mashei.redisplugin.view

import dev.mashei.redisplugin.action.AddConnectionAction
import java.util.function.Consumer

class ConnectionManager {

    fun init() {
        val add = AddConnectionAction()
        add.actionEventConsumer = Consumer { t -> t }
    }
}