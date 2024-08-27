package ejercicios.examen_psp;

import java.util.Scanner;

public class UsaHilo2 {
    public static void main(String[] args) {

        String textoQuijote = ("Don Quijote de la Mancha\n" +
                "1\n" +
                "2\n" +
                "CAPÍTULO PRIMERO\n" +
                "\n" +
                "Que trata de la condición y ejercicio del famoso y valiente hidalgoI don Quijote de la Mancha1\n" +
                "En un lugar de la Mancha2, de cuyo nombre no quiero acordarme3, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor4. Una olla de algo más vaca que carnero, salpicón las más noches5, duelos y quebrantos los sábados6, lantejas los viernes7, algún palomino de añadidura los domingos8, consumían las tres partes de su hacienda9. El resto della concluían sayo de velarte10, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo11, y los días de entresemana se honraba con su vellorí de lo más fino12. Tenía en su casa una ama que pasaba de los cuarenta y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza que así ensillaba el rocín como tomaba la podadera13. Frisaba la edad de nuestro hidalgo con los cincuenta años14. Era de complexión recia, seco de carnes, enjuto de rostro15, gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre de «Quijada», o «Quesada», que en esto hay alguna diferencia en los autores que deste caso escriben, aunque por conjeturas verisímilesII se deja entender que se llamaba «Quijana»III, 16. Pero esto importa poco a nuestro cuento: basta que en la narración dél no se salga un punto de la verdad.\n"
                +
                "\n" +
                "Es, pues, de saber que este sobredicho hidalgo, los ratos que estaba ocioso —que eran los más del año—, se daba a leer libros de caballerías, con tanta afición y gusto, que olvidó casi de todo punto el ejercicio de la caza y aun la administración de su hacienda; y llegó a tanto su curiosidad y desatino en esto17, que vendió muchas hanegas de tierra de sembradura para comprar libros de caballerías en queIV leer18, y, así, llevó a su casa todos cuantos pudo haber dellos; y, de todos, ningunos le parecían tan bienV como los que compuso el famoso Feliciano de Silva19, porque la claridad de su prosa y aquellas entricadas razones suyas le parecían de perlas, y más cuando llegaba a leer aquellos requiebros y cartas de desafíos20, donde en muchas partes hallaba escrito: «La razón de la sinrazón que a mi razón se hace, de tal manera mi razón enflaquece, que con razón me quejo de la vuestra fermosura»21. Y también cuando leía: «Los altos cielos que de vuestra divinidad divinamente con las estrellas os fortifican y os hacen merecedora del merecimiento que merece la vuestra grandeza...»22\n"
                +
                "\n" +
                "Con estas razones perdía el pobre caballero el juicio, y desvelábase por entenderlas y desentrañarles el sentido, que no se lo sacara ni las entendiera el mesmo Aristóteles, si resucitara para solo ello. No estaba muy bien con las heridas que don Belianís daba y recebía, porque se imaginaba que, por grandes maestros que le hubiesen curado, no dejaría de tener el rostro y todo el cuerpo lleno de cicatrices y señales23. Pero, con todo, alababa en su autor aquel acabar su libro con la promesa de aquella inacabable aventura, y muchas veces le vino deseo de tomar la pluma y dalle fin al pie de la letra como allí se promete24; y sin duda alguna lo hiciera, y aun saliera con ello25, si otros mayores y continuos pensamientos no se lo estorbaran. Tuvo muchas veces competencia con el cura de su lugar —que era hombre docto, graduado en Cigüenza—26 sobre cuál había sido mejor caballero: Palmerín de Ingalaterra o Amadís de Gaula27; mas maese Nicolás, barbero del mesmo pueblo28, decía que ninguno llegaba al Caballero del Febo, y que si alguno se le podía comparar era don Galaor, hermano de Amadís de Gaula, porque tenía muy acomodada condición para todo, que no era caballero melindroso, ni tan llorón como su hermano, y que en lo de la valentía no le iba en zaga29.\n"
                +
                "\n" +
                "En resolución, él se enfrascó tanto en su letura, que se le pasaban las noches leyendo de claro en claro30, y los días de turbio en turbio; y así, del poco dormir y del mucho leer, se le secó el celebro de manera que vino a perder el juicio31. Llenósele la fantasía de todo aquello que leía en los libros, así de encantamentos como de pendencias, batallas, desafíos, heridas, requiebros, amores, tormentas y disparates imposibles; y asentósele de tal modo en la imaginación que era verdad toda aquella máquina de aquellas soñadas invencionesVI que leía32, que para él no había otra historia más cierta en el mundo33. Decía él que el Cid Ruy Díaz había sido muy buen caballero, pero que no tenía que ver con el Caballero de la Ardiente Espada, que de solo un revés había partido por medio dos fieros y descomunales gigantes34. Mejor estaba con Bernardo del Carpio, porque en Roncesvalles había muerto a Roldán, el encantado35, valiéndose de la industria de Hércules, cuando ahogó a AnteoVII, el hijo de la Tierra, entre los brazos36. Decía mucho bien del gigante Morgante, porque, con ser de aquella generación gigantea, que todos son soberbios y descomedidos, él solo era afable y bien criado37. Pero, sobre todos, estaba bien con Reinaldos de Montalbán, y más cuando le veía salir de su castillo y robar cuantos topaba, y cuando en allende robó aquel ídolo de Mahoma que era todo de oro, según dice su historia38. Diera él, por dar una mano de coces al traidor de Galalón39, al ama que tenía, y aun a su sobrina de añadidura.");

        String textoCelestina = ("CELESTINA\n" +
                "Tragicomedia de Calisto y Melibea\n" +
                "(1499-1500)\n" +
                "Fernando de Rojas\n" +
                "El autor a un su amigo\n" +
                "Page1 \n" +
                "Suelen los que de sus tierras ausentes se hallan considerar de qué cosa aquel lugar donde\n" +
                "parten mayor inopia o falta padezca, para con la tal servir a los conterráneos, de quien en algún\n" +
                "tiempo beneficio recibido tienen y, viendo que legítima obligación a investigar lo semejante me\n" +
                "compelía para pagar las muchas mercedes de vuestra libre liberalidad recibidas, asaz veces\n" +
                "retraído en mi cámara, acostado sobre mi propia mano, echando mis sentidos por ventores y mi\n" +
                "juicio a volar, me venía a la memoria, no sólo la necesidad que nuestra común patria tiene de la\n" +
                "presente obra, por la muchedumbre de galanes y enamorados mancebos que posee, pero aun en\n" +
                "particular vuestra misma persona, cuya juventud de amor ser presa se me representa haber visto\n" +
                "y de él cruelmente lastimada, a causa de le faltar defensivas armas para resistir sus fuegos, las\n" +
                "cuales hallé esculpidas en estos papeles; no fabricadas en las grandes herrerías de Milán, mas en\n" +
                "los claros ingenios de doctos varones castellanos formadas. Y como mirase su primor, sutil\n" +
                "artificio, su fuerte y claro metal, su modo y manera de labor, su estilo elegante, jamás en nuestra\n"
                +
                "castellana lengua visto ni oído, leílo tres o cuatro veces. Y tantas cuantas más lo leía, tanta más\n"
                +
                "necesidad me ponía de releerlo, y tanto más me agradaba, y en su proceso nuevas sentencias\n" +
                "sentía. Vi, no sólo ser dulce en su principal historia, o ficción toda junta; pero aun de algunas sus\n"
                +
                "particularidades salían deleitables fontecicas de filosofía, de otros agradables donaires, de otros\n"
                +
                "avisos y consejos contra lisonjeros y malos sirvientes, y falsas mujeres hechiceras. Vi que no\n" +
                "tenía su firma del autor, el cual, según algunos dicen, fue Juan de Mena, y según otros, Rodrigo\n" +
                "Cota; pero quien quiere que fuese, es digno de recordable memoria por la sutil invención, por la ");

        Hilo2 hiloQuijote = new Hilo2(textoQuijote);
        Hilo2 hiloCelestina = new Hilo2(textoCelestina);

        hiloQuijote.start();
        hiloCelestina.start();
    }
}
