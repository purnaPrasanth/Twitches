package com.purnaprasanth.statemachine

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted.Companion.Eagerly
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.scan
import kotlinx.coroutines.flow.stateIn

/**
 * Created by viking_93 on 15/06/2021
 **/

fun CoroutineScope.startStateMachine(
    initialState: State,
    actionChannel: Flow<Action>
): StateFlow<State> = actionChannel.scan(initialState) { oldState, action ->
    oldState.consumeAction(action)
}.stateIn(this, Eagerly, initialState)