/*
 * Created by Andrii Kovalchuk on 26.11.19 20:29
 * Copyright (c) 2019. All rights reserved.
 * Last modified 26.11.19 18:01
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.mmdev.business.cards.repository

import com.mmdev.business.cards.model.CardItem
import io.reactivex.Single

/**
 * This is the documentation block about the class
 */

interface CardsRepository {

	fun addToSkipped(skippedCardItem: CardItem)

	fun getUsersByPreferences(): Single<List<CardItem>>

	fun handlePossibleMatch(likedCardItem: CardItem): Single<Boolean>


}
