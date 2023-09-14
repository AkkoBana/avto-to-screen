package com.akkobana.avto_to.utils

import com.akkobana.avto_to.model.Menu
import com.akkobana.avto_to.R

object MenuItemListEntity {
    val menuItemList = listOf(
        Menu(R.drawable.ic_wheel,"Каталог автозапчастей"),
        Menu(R.drawable.ic_text_cloud,"Вопросы по заказам"),
        Menu(R.drawable.ic_truck,"Доставка"),
        Menu(R.drawable.ic_question_circle,"Рекламации")
    )
}