package com.purnaprasanth.base.events

import io.reactivex.Observable

interface EventSource {
    val eventSource: Observable<Event>
}

interface ScreenBoundedEventSource {
    val screenBoundedEventSource: Observable<Observable<Event>>
}