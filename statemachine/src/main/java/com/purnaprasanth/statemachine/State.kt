package com.purnaprasanth.statemachine

interface State {
    suspend fun consumeAction(action: Action): State
}