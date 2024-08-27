package ejercicios.cuestionario_preguntas;

import java.util.Random;
import java.util.Scanner;

public class JuegoPreguntas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preguntas y respuestas desordenadas
        String[] preguntas = {
                "¿Cuál es el propósito principal del módulo de Marketing en Odoo?",
                "¿Qué tipo de campañas se pueden crear con el módulo de Odoo: Campañas de Marketing?",
                "¿Cuál es una de las funciones clave de las campañas de marketing en Odoo?",
                "¿Qué herramientas proporciona Odoo para medir el rendimiento de una campaña de marketing?",
                "¿Qué pasos seguimos para crear un presupuesto en odoo?",
                "¿Qué se opciones se pueden modificar en un presupuesto?",
                "Selecciona la afirmación correcta",
                "¿Qué tipo de factura podemos crear? Selecciona la incorrecta",
                "¿Qué podemos observar en la vista previa del presupuesto?",
                "¿Cuál de los siguientes no es un paso imprescindible para la creación de una factura?",
                "¿Qué otro módulo está muy relacionado con el de facturación?",
                "¿Qué información se puede incluir en una factura en Odoo?",
                "¿Cuál es la ventaja de utilizar plantillas de factura en Odoo?",
                "¿Qué métodos tenemos para enviar una factura?",
                "¿Cuál es el propósito principal del mantenimiento en Odoo?",
                "¿Qué módulo de Odoo se utiliza para administrar el mantenimiento de activos físicos, como maquinaria y equipos?",
                "¿Qué tipo de mantenimiento se realiza en Odoo cuando se realiza un mantenimiento preventivo regularmente programado?",
                "¿Qué herramienta de Odoo se utiliza para realizar un seguimiento de las actividades de mantenimiento y programar trabajos futuros?",
                "¿Cuál es el objetivo del módulo de gestión de mantenimiento en Odoo?",
                "¿Qué funcionalidades ofrece el módulo de calendario de Odoo?",
                "¿Qué tipo de información se puede adjuntar a un evento en el calendario de Odoo?",
                "¿Cuál es una característica clave del módulo de calendario de Odoo?",
                "¿Qué tipo de vista ofrece el calendario de Odoo para visualizar los eventos, a parte de la de calendario?",
                "¿Qué tipo de eventos se pueden crear en el módulo de calendario de Odoo?",
                "¿Cuál es el propósito principal del módulo de ventas en Odoo?",
                "¿Qué es un 'Presupuesto de Venta' en Odoo?",
                "¿Qué función realiza el módulo 'CRM' dentro del módulo de ventas de Odoo?",
                "¿Qué tipo de documentos se pueden generar en Odoo para las ventas?",
                "¿Qué es un 'Pipeline de Ventas' en Odoo?",
                "¿Cuál de las siguientes es un tipo de pregunta en el módulo de encuestas?",
                "¿Cómo se pueden agrupar las preguntas en una encuesta?",
                "¿Para qué sirve la pestaña 'crear una sesión en vivo'?",
                "En cuanto a las encuestas y la certificación,",
                "¿De qué modo se puede controlar el acceso a la realización de las encuestas? Elige una o varias.",
                "¿Cuál es el fin del módulo de empleados de Odoo?",
                "¿Para que sirve la acción de imprimir al crear un nuevo empleado?",
                "¿Qué condiciones hay para lanzar un plan?",
                "¿De que sirven las actividades del módulo empleados?",
                "¿Qué problema hay si el departamento que le aplico a un nuevo empleado no esta creado en Odoo?",
                "¿Cuál es el propósito principal del módulo de conversaciones en Odoo?",
                "¿Qué tipo de información se puede compartir a través de las conversaciones en Odoo?",
                "¿Cómo se puede adjuntar un archivo a una conversación en Odoo?",
                "¿Qué ventaja ofrece la función de seguimiento de conversaciones en Odoo?",
                "¿Cuál de las siguientes afirmaciones es cierta acerca de las conversaciones en Odoo?",
                "¿Qué significa CRM en el contexto de Odoo?",
                "Dentro del módulo CRM de Odoo, ¿qué funcionalidad principal permite a las empresas hacer?",
                "¿Qué elemento representa una oportunidad o venta potencial en el módulo CRM de Odoo?",
                "En Odoo CRM, ¿qué herramienta ayuda a visualizar el progreso de las oportunidades a través de diferentes etapas?",
                "En el contexto de Odoo CRM, que se considera evento en el apartado de contactos?",
                "¿En qué formato puedes importar contactos en odoo?",
                "¿Cuántos contactos puedes tener por empresa?",
                "¿Puedes importar contactos desde google?",
                "¿Puedes añadir filtros personalizados?",
                "¿Para qué se usa la opcion de fusionar contactos?"
        };

        String[][] respuestas = {
                { "R1: Planificar y ejecutar estrategias de marketing.",
                        "r2: Administrar proyectos de desarrollo de software.",
                        "R3: Administrar proyectos de desarrollo de software.",
                        "r4: Administrar proyectos de desarrollo de software." },
                { "R1: Campañas de marketing por correo electrónico.", "r2: Campañas de promoción de salud.",
                        "r3: Campañas de marketing por correo electrónico.", "r4: Campañas de jardinería." },
                { "R1: Seguimiento de leads y oportunidades.", "r2: Gestionar recursos humanos.",
                        "r3: Seguimiento de leads y oportunidades.", "r4: Hacer reservas de vuelos." },
                { "R1: Informes y análisis de resultados.", "r2: Tablas periódicas de elementos químicos.",
                        "r3: Informes y análisis de resultados.", "r4: Recetas de cocina." },
                { "R1: Todas son correctas", "r2: Crear nuevo presupuesto", "r3: Añadir productos",
                        "r4: Añadir datos del cliente" },
                { "R1: Todas son correctas", "r2: Posición fiscal", "r3: Plazo de pago",
                        "r4: No se puede modificar nada" },
                { "R1: Podemos crear productos para tenerlos más accesibles",
                        "r2: Solo puedes añadir productos que ya estén creados",
                        "r3: Los impuestos serán fijos e inmodificables",
                        "r4: Solo pueden pedirse un número determinado de productos" },
                { "R1: Factura irregular", "r2: Factura regular", "r3: Anticipo (porcentaje)",
                        "r4: Anticipo (cantidad fija)" },
                { "R1: Todas son correctas", "r2: Dirección de facturación y envío", "r3: Precio",
                        "r4: Términos de pago" },
                { "R1: Crear un contacto", "R2: Crear una empresa", "R3: Añadir cuenta bancaria",
                        "R4: Configurar un diseño de factura" },
                { "R1: Contabilidad", "R2: Calendario", "R3: Presupuestos", "R4: Empleados" },
                { "R1: El nombre del cliente, los productos o servicios, los impuestos y el importe total.",
                        "R2: Solo el nombre del cliente y el importe total.",
                        "R3: El nombre del cliente, el importe total y la fecha de vencimiento.",
                        "R4: El nombre del cliente y la dirección de correo electrónico." },
                { "R1: Agilizar el proceso de creación de facturas con información predefinida.",
                        "R2: Personalizar la fuente y el formato del texto.",
                        "R3: Enviar facturas por correo electrónico.",
                        "R4: Añadir productos o servicios a la factura" },
                { "R1: Correo electrónico y postal", "R2: Solo correo electrónico", "R3: Correo electrónico y fax",
                        "R4: Correo electrónico, postal y fax" },
                { "R1: Gestionar recursos humanos", "r2: Realizar copias de seguridad",
                        "r3: Mantener y mejorar la funcionalidad del sistema", "r4: Generar informes financieros" },
                { "R1: Recursos Humanos", "r2: Inventario", "r3: Mantenimiento Preventivo", "r4: Ventas" },
                { "R1: Mantenimiento Correctivo", "r2: Mantenimiento Predictivo", "r3: Mantenimiento Preventivo",
                        "r4: Mantenimiento de Emergencia" },
                { "R1: Calendario", "r2: Páginas web", "r3: Facturación", "r4: Compras" },
                { "R1: Gestionar recursos humanos", "r2: Gestionar proyectos de construcción",
                        "r3: Gestionar tareas de mantenimiento de activos",
                        "r4: Gestionar la nómina de los empleados" },
                { "R1: Todas son correctas", "R2: Gestión de eventos y reuniones",
                        "R3: Sincronización con redes sociales", "R4: Administración de cuentas bancarias." },
                { "R1: Documentos y enlaces", "R2: Archivos ejecutables", "R3: Videos en streaming",
                        "R4: Cuentas de correo" },
                { "R1: Posibilidad de crear recordatorios y alertas", "R2: Integración con Microsoft Office",
                        "R3: Crear un producto", "R4: Gestión de redes sociales" },
                { "R1: Vista de lista", "R2: Vista de árbol", "R3: Vista de mapa", "R4: Vista de sección" },
                { "R1: Ambas opciones son correctas", "R2: Reuniones", "R3: Tareas", "R4: Ninguna de las anteriores" },
                { "R1: Administrar las ventas y el proceso de facturación.",
                        "R2: Gestionar la contabilidad de la empresa.", "R3: Controlar el inventario de productos.",
                        "R4: Gestionar los recursos humanos." },
                { "R1: Un pronóstico de las ventas futuras de la empresa.",
                        "R2: Una cotización de precio a un cliente.", "R3: Un informe de los gastos operativos.",
                        "R4: Un registro de los activos de la empresa." },
                { "R1: Gestiona las relaciones con los clientes y las oportunidades de ventas.",
                        "R2: Registra las compras de los clientes.", "R3: Calcula los impuestos sobre las ventas.",
                        "R4: Controla el inventario de productos." },
                { "R1: Facturas, pedidos de venta y notas de crédito.",
                        "R2: Facturas, pedidos de compra y notas de débito.",
                        "R3: Facturas, cotizaciones y reportes de gastos.",
                        "R4: Facturas, órdenes de producción y recibos de nómina." },
                { "R1: Un gráfico que muestra el flujo de ventas desde las oportunidades hasta el cierre.",
                        "R2: Un conducto de agua utilizado en la producción.",
                        "R3: Un informe financiero anual de la empresa.", "R4: Un sistema de gestión de inventario." },
                { "R1: Pregunta de Matriz", "R2: Pregunta de Verdadero/Falso", "R3: Pregunta Retórica",
                        "R4: Pregunta Condicional" },
                { "R1: Mediante la opción de Secciones", "R2: Poniendo juntas las preguntas relacionadas",
                        "R3: Mediante la opción de bloques", "R4: No se pueden agrupar" },
                { "R1: Para hacer una encuesta en tiempo real al estilo Kahoot",
                        "R2: Para crear una encuesta que se pueda enviar por correo electrónico",
                        "R3: A y B son correctas", "R4: No existe esa pestaña" },
                { "R1: Se puede obtener una certificación si superas los requisitos marcados en la creación de la encuesta",
                        "R2: Solo se puede obtener la certificación si respondes al 100% de las preguntas de la encuesta",
                        "R3: Solo se puede obtener la certificación si sacas una puntuación del 100%",
                        "R4: No es posible obtener una certificación" },
                { "R1: R2 y R3 son Correctas", "R2: Cualquiera con el link", "R3: Personas invitadas solamente",
                        "R4: Mediante una autentificación F2A" },
                { "R1: R4 y R2 son correctas",
                        "R2: Tener un control del numero de trabajadores de la empresa y sus horarios de trabajo",
                        "R3: Para llamar a los trabajadores por telefono",
                        "R4: Recopilar informacion personal sobre los trabajadores" },
                { "R1: Para crear una tarjeta de credencial e imprimirla",
                        "R2: Para imprimir una ficha de empleado exponiendo toda la información introducida en su ficha",
                        "R3: Para poder imprimir en papel y archivar los datos de los empleados",
                        "R4: Todas son falsas" },
                { "R1: Todas son correctas", "R2: El empleado debe estar vinculado a un usuario",
                        "R3: El empleado debe tener establecido un responsable",
                        "R4: El empleado no puede no tener nombre" },
                { "R1: Ninguna es correcta", "R2: Para moverlo despedirlo", "R3: Para moverlo de departamento",
                        "R4: No sirve para gestionar llamadas, correos, reuniones ni cosas por hacer por el empleado" },
                { "R1: Ninguna es correcta", "R2: Salta un error y no te deja crear el usuario",
                        "R3: Crea el usuario pero te sale una notificación como que debes modificar dicho usuario para introducir la informacion correcta",
                        "R4: R2 y R3 son correctas" },
                { "R1: Customer Relationship Management", "r2: Capitalist Resource Machine",
                        "r3: Company Recaurser Methodology", "r4: Content Retrieval Mechanism v.2" },
                { "R1: Optimizar la comunicación interna y externa.", "R2: Facilitar la gestión de recursos humanos.",
                        "R3: Mejorar la gestión de ventas.", "R4: Automatizar la contabilidad." },
                { "R1: Comunicaciones internas y externas.", "R2: Resultados de análisis de mercado.",
                        "R3: Documentos de recursos humanos.", "R4: Datos financieros confidenciales." },
                { "R1: Usando la función de arrastrar y soltar archivos.",
                        "R2: No es posible adjuntar archivos en las conversaciones de Odoo.",
                        "R3: Mediante un enlace a una carpeta de archivos.",
                        "R4: Solo a través de correo electrónico externo." },
                { "R1: Proporciona un historial completo de las interacciones.",
                        "R2: Permite archivar automáticamente todas las conversaciones.",
                        "R3: Facilita el acceso a emojis y GIFs en las conversaciones.",
                        "R4: Ofrece transcripción automática de las conversaciones." },
                { "R1: Pueden automatizarse con flujos de trabajo y reglas.",
                        "R2: Solo están disponibles para usuarios de nivel administrativo.",
                        "R3: No se pueden personalizar ni integrar con otras aplicaciones.",
                        "R4: Son únicamente para comunicaciones internas." },
                { "R1: Customer Relationship Management", "r2: Capitalist Resource Machine",
                        "r3: Company Recaurser Methodology", "r4: Content Retrieval Mechanism v.2" },
                { "R1: Gestionar y rastrear oportunidades de ventas", "r2: Administrar inventario y almacén",
                        "r3: Realizar pagos y facturación", "r4: Controlar recursos humanos y nómina" },
                { "R1: Lead", "r2: chatarra", "r3: ordenes", "r4: Tickets" },
                { "R1: Kanban View", "r2: List View", "r3: Grid View", "r4: Pivot view" },
                { "R1: llamadas,conferencias...", "r2: presupuestos", "r3: leads sin fechas",
                        "r4: empleados con comisiones" },
                { "R1: R2 y R3 son correctas", "r2: CSV", "r3: Excel", "r4: No se puede importar" },
                { "R1: Ilimitados", "r2: 1", "r3: 10", "r4: 50" },
                { "R1: Si, pero necesitas usar la api de google", "r2: Si", "r3: No",
                        "r4: Depende del sistema operativo" },
                { "R1: Si", "r2: Si", "r3: No", "r4: Solo los que te da Odoo" },
                { "R1: Para unir contactos repetidos", "r2: Para unir contactos de la misma empresa",
                        "r3: Para mejorar contactos", "r4: Se transforman en Megazord" },
        };

        // Shuffle the questions and answers
        shuffleArray(preguntas, respuestas);

        int nota = 0;
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("Pregunta: " + preguntas[i]);
            for (int j = 0; j < respuestas[i].length; j++) {
                System.out.println(respuestas[i][j]);
            }

            String userAnswer = scanner.nextLine().trim().toLowerCase();
            if (userAnswer.equals("r1")) {
                System.out.println("¡Respuesta correcta!");
                nota++; // Increment the score by 1.
            } else {
                System.out.println("Respuesta incorrecta.");
            }
        }

        System.out.println("Tu nota final es: " + nota);
        scanner.close();
    }

    private static void shuffleArray(String[] preguntas, String[][] respuestas) {
        Random random = new Random();
        for (int i = preguntas.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            String tempPregunta = preguntas[i];
            preguntas[i] = preguntas[index];
            preguntas[index] = tempPregunta;

            String[] tempRespuestas = respuestas[i];
            respuestas[i] = respuestas[index];
            respuestas[index] = tempRespuestas;
        }
    }
}
