package com.severo.testing.model

import com.severo.core.domain.model.Event

class EventFactory {

    fun create(event: FakeEvent) = when (event) {
        FakeEvent.FakeEvent1 -> Event(
            1,
            "http://fakeurl.jpg"
        )
    }

    sealed class FakeEvent {
        object FakeEvent1 : FakeEvent()
    }
}