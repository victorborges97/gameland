package com.borges.gameland.dummy

import java.util.ArrayList
import java.util.HashMap

object DummyContentMovies {

    val ITEMS: MutableList<DummyItem> = ArrayList()

    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    private val games = arrayOf("Valorant", "Undertale", "Counter-Strike: Global Offensive", "Disco Elysium",
    "Hollow Knight", "Stardew Valley", "XCOM 2", "Sid Meier's Civilization VI", "Call of Duty: Modern Warfare",
        "Doom Eternal", "Resident Evil 2", "Celeste", "League of Legends", "Fortnite: Battle Royale", "Apex Legends",
        "Warframe", "Dead Cells", "Monster Hunter: World", "Control", "Final Fantasy XIV", "Minecraft",
        "Red Dead Redemption 2", "Grand Theft Auto V", "The Witcher 3: Wild Hunt",
        "Portal 2", "Last4Dead")

    private val COUNT = 25

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(games[i], i))
        }
    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(name: String, position: Int): DummyItem {
        return DummyItem(position.toString(), name, makeDetails(position), "PHOTO")
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Filme: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    data class DummyItem(val id: String, val content: String, val details: String, val photo: String) {
        override fun toString(): String = content
    }
}