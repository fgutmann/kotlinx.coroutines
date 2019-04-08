/*
 * Copyright 2016-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.coroutines.rx2

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.reactive.flow.*
import org.reactivestreams.*

class IterableFlowAsFlowableTckTest : IterableFlowTckTest() {

    override fun createPublisher(elements: Long): Publisher<Long> {
        return generate(elements).asIterable().asFlow().asFlowable()
    }

    override fun createFailedPublisher(): Publisher<Long>? = null
}
