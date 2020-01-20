package com.purnaprasanth.base.events

sealed class Event {
    abstract val name: String

    abstract val metaData: Map<String, Any>
}

data class ScreenOpenEvent(
    override val name: String,
    override val metaData: Map<String, Any>
) : Event()

data class ScreenClosedEvent(
    override val name: String,
    override val metaData: Map<String, Any>
) : Event()

data class ScreenIntermediateEvent(
    override val name: String,
    override val metaData: Map<String, Any>
) : Event()