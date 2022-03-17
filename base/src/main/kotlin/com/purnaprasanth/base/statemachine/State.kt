package com.purnaprasanth.base.statemachine

interface State {
    suspend fun consumeAction(action: Action): State
}
