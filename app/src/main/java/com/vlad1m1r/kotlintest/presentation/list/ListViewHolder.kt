/*
 * Copyright 2017 Vladimir Jovanovic
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vlad1m1r.kotlintest.presentation.list

import android.view.View
import com.vlad1m1r.kotlintest.domain.models.PhotoData
import com.vlad1m1r.kotlintest.presentation.base.BaseViewHolder
import com.vlad1m1r.kotlintest.presentation.utils.ImageLoader
import kotlinx.android.synthetic.main.item_photo.view.*

class ListViewHolder(itemView: View, private val imageLoader: ImageLoader) : BaseViewHolder(itemView) {

    fun setPhoto(itemPhoto: PhotoData) {
        itemView.textName.text = itemPhoto.name
        imageLoader.load(itemView.context, itemPhoto.url, itemView.imageView)
    }
}
