package com.borges.gameland.dummy

import java.util.ArrayList
import java.util.HashMap

object DummyContentGames {

    val ITEMS: MutableList<DummyItem> = ArrayList()

    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    data class DataGames(var name: String, var url: String)
    private val games = arrayOf(
        DataGames("Valorant", "https://sm.ign.com/ign_br/screenshot/default/valorant-2020-4k-0f_nnby.jpg"),
        DataGames("Undertale", "https://sm.ign.com/ign_br/blogroll/u/undertale-/undertale-announced-for-nintendo-switch_9j16.jpg"),
        DataGames("Counter-Strike: Global Offensive", "https://sm.ign.com/ign_br/screenshot/default/csgo-image_pusy.png"),
        DataGames("Disco Elysium","https://cdn1.epicgames.com/ff52981b1d9947978153c7a7f8bc6d90/offer/EGS_DiscoElysiumTheFinalCut_ZAUM_S5-1920x1080-d4811511d7c3b0442ccf811184e3e68a.jpg?h=270&resize=1&w=480"),
        DataGames("Hollow Knight", "https://cdn.akamai.steamstatic.com/steam/apps/367520/capsule_616x353.jpg?t=1601950406"),
        DataGames("Stardew Valley", "https://sm.ign.com/ign_br/screenshot/9/9-stardew-/9-stardew-valleybrbrborn-out-of-harvest-moon-it-makes-perfec_1153.jpg"),
        DataGames("Sid Meier's Civilization VI", "https://sm.ign.com/ign_br/screenshot/default/civilizationvi-art-leader-trajan-landscape_7wcx.jpg"),
        DataGames("Call of Duty: Modern Warfare","https://image.api.playstation.com/vulcan/img/rnd/202010/2320/i5l1jLAhFSTiO7lSCNDWjJ2J.jpg"),
        DataGames("Doom Eternal", "https://consciencianerd.com/wp-content/uploads/2020/12/doom-eternal-xbox-game-pass.jpg"),
        DataGames("Resident Evil 2", "https://image.api.playstation.com/gs2-sec/appkgo/prod/CUSA09171_00/3/i_09f3f4c0abaf093d24b9a68722d03bcf2993a19d98b3209c5206c8dc7f7ee9de/i/icon0.png"),
        DataGames("Celeste", "https://assets1.ignimgs.com/2018/01/24/celeste-2-1280-1516825733137.jpg"),
        DataGames("League of Legends", "https://sm.ign.com/ign_br/screenshot/default/lol_cjy3.jpg"),
        DataGames("Fortnite: Battle Royale", "https://sm.ign.com/ign_br/screenshot/default/fortnite-aquaman_ceg7.jpg"),
        DataGames("Apex Legends","https://sm.ign.com/ign_br/screenshot/h/h321-apex-/h321-apex-legendsh3amid-the-rise-of-the-battle-royale-genre_1h86.jpg"),
        DataGames("Warframe", "https://sm.ign.com/ign_br/news/w/warframe-c/warframe-confirmed-for-ps5-and-xbox-series-x_jyee.jpg"),
        DataGames("Dead Cells", "https://sm.ign.com/ign_br/screenshot/default/dead-cells-destaque_ffuw.jpg"),
        DataGames("Monster Hunter: World", "https://oyster.ignimgs.com/wordpress/stg.ign.com/2019/06/mainart-720x405.jpg"),
        DataGames("Control", "https://meups.com.br/wp-content/uploads/2019/07/CONTROL-2.jpg"),
        DataGames("Final Fantasy XIV", "https://assets1.ignimgs.com/2019/07/02/shadowbringers-thumb-1562091786618.jpg"),
        DataGames("Minecraft", "https://oyster.ignimgs.com/wordpress/stg.ign.com/2019/03/Minecraft-720x405.jpg"),
        DataGames("Red Dead Redemption 2", "https://image.api.playstation.com/cdn/UP1004/CUSA03041_00/Hpl5MtwQgOVF9vJqlfui6SDB5Jl4oBSq.png"),
        DataGames("Grand Theft Auto V", "https://sm.ign.com/ign_br/screenshot/default/wp2038345_21s8.jpg"),
        DataGames("The Witcher 3: Wild Hunt", "https://image.api.playstation.com/vulcan/img/rnd/202009/2913/TQKAd8U6hnIFQIIcz6qnFh8C.png"),
        DataGames("Portal 2", "https://sm.ign.com/ign_br/screenshot/default/portal-2_d1cf.jpg"),
        DataGames("Left4Dead 2", "https://1.bp.blogspot.com/-UtBL1Jthvzs/XTi7ms3cDfI/AAAAAAAABtY/VmOlHpjPX8Iwd3KjtNGMW5LAc0jNSmeTQCEwYBhgL/s1600/CAPA.jpg")
    )

    private val COUNT = 24

    init {
        for (i in 0..COUNT) {
            addItem(createDummyItem(games[i].name, games[i].url, i))
        }
    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(name: String, url: String, position: Int): DummyItem {
        return DummyItem(position.toString(), name, makeDetails(position), url)
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Game: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    data class DummyItem(val id: String, val content: String, val details: String, val photo: String) {
        override fun toString(): String = content
    }
}