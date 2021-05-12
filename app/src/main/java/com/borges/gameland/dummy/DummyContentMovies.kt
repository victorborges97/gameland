package com.borges.gameland.dummy

import java.util.ArrayList
import java.util.HashMap

object DummyContentMovies {

    val ITEMS: MutableList<DummyItem> = ArrayList()

    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()
    data class DataMovies(var name: String, var url: String)
    private val games = arrayOf(
        DataMovies("O Tigre Branco","https://www.oficinadanet.com.br/imagens/post/30383/750xNxo-tigre-branco.jpg.pagespeed.ic.b759417c6b.jpg"),
        DataMovies("Orgulho e Preconceito","https://www.oficinadanet.com.br/imagens/post/30383/750xNxorgulho-e-preconceito.jpg.pagespeed.ic.a3a5806008.jpg"),
        DataMovies("O Segredo: Ouse sonhar","https://www.oficinadanet.com.br/imagens/post/30383/750xNxo-segredo-ouse-sonhar.jpg.pagespeed.ic.9f0e74b87a.jpg"),
        DataMovies("Moxie: Quando as Garotas vão à Luta","https://www.oficinadanet.com.br/imagens/post/30383/750xNxmoxie-quando-as-garotas-vao-a-luta.jpg.pagespeed.ic.0802f42865.jpg"),
        DataMovies("Pai em Dobro","https://www.oficinadanet.com.br/imagens/post/30383/750xNxpai-em-dobro.jpg.pagespeed.ic.d08876475d.jpg"),
        DataMovies("Era uma vez um sonho","https://www.oficinadanet.com.br/imagens/post/30383/750xNxera-uma-vez-um-sonho.jpg.pagespeed.ic.58c61e72c9.jpg"),
        DataMovies("Rebecca - A Mulher Inesquecível","https://www.oficinadanet.com.br/imagens/post/30383/750xNxrebecca-a-mulher-inesquecivel.jpg.pagespeed.ic.faa28fcc76.jpg"),
        DataMovies("Enola Holmes","https://www.oficinadanet.com.br/imagens/post/30383/750xNxenola-holmes.jpg.pagespeed.ic.4733c2efff.jpg"),
        DataMovies("A barraca do Beijo","https://www.oficinadanet.com.br/imagens/post/30383/750xNxa-barraca-do-beijo-2.jpg.pagespeed.ic.dbfc09f0b3.jpg"),
        DataMovies("No coração do Mar","https://www.oficinadanet.com.br/imagens/post/30383/750xNxno-coracao-do-mar.jpg.pagespeed.ic.48ef6428f4.jpg"),
        DataMovies("Quase uma Rockstar","https://www.oficinadanet.com.br/imagens/post/30383/750xNxquase-uma-rockstar-1.jpg.pagespeed.ic.a877afdd36.jpg"),
        DataMovies("365 Dyas","https://www.oficinadanet.com.br/imagens/post/30383/750xNx365-dias.jpg.pagespeed.ic.4f74f0bfec.jpg"),
        DataMovies("The Old Guard","https://www.oficinadanet.com.br/imagens/post/30383/750xNxthe-old-guard.jpg.pagespeed.ic.5fc7c0034f.jpg"),
        DataMovies("Felicidade por um fio","https://www.oficinadanet.com.br/imagens/post/30383/750xNxfelicidade-por-um-fio.jpg.pagespeed.ic.7a5655369e.jpg"),
        DataMovies("Por Lugares Incríveis","https://www.oficinadanet.com.br/imagens/post/30383/750xNxpor-lugares-incriveis.jpg.pagespeed.ic.b1bb5b9d21.jpg"),
        DataMovies("O Bom Sam","https://www.oficinadanet.com.br/imagens/post/30383/750xNxo-bom-sam.jpg.pagespeed.ic.b470f0bd4c.jpg"),
        DataMovies("Os Irmãos Willoughby","https://www.oficinadanet.com.br/imagens/post/30383/750xNxos-irmaos-willoughby.jpg.pagespeed.ic.3ad5810704.jpg"),
        DataMovies("O menino que descobriu o vento","https://miro.medium.com/max/2560/1*C35cBAeo2PoLVM_BKfD60Q.jpeg"),
        DataMovies("Animais Fantásticos e onde habitam","https://sucodemanga.com.br/wp-content/uploads/2016/11/animais-fantasticos-e-onde-habitam-thumb.jpg"),
        DataMovies("Deixe a neve cair","https://www.oficinadanet.com.br/imagens/post/28402/deixe-a-neve-cair.jpg"),
        DataMovies("Dumplin","https://almde50tons.files.wordpress.com/2019/02/dumplin_poster_goldposter_com_4.jpg"),
        DataMovies("Bird Box","https://m.media-amazon.com/images/I/41sRIihnXzL.jpg"),
        DataMovies("Somos todos iguais","https://images-americanas.b2w.io/produtos/01/00/sku/30861/4/30861472_1GG.jpg"),
        DataMovies("Antes de dormir","https://www.oficinadanet.com.br/imagens/post/30332/750xNxantes-de-dormir.jpg.pagespeed.ic.2c6dbfeef2.jpg"),
        DataMovies("Amor e Outras Drogas","https://www.oficinadanet.com.br/imagens/post/30332/750xNxamor-e-outras-drogas.jpg.pagespeed.ic.80bf64e643.jpg")
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