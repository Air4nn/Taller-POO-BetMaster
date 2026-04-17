# 🎲 Sistema de Casa de Apuestas "BetMaster"

Para visuaalizar los diagramas de este proyecto ingrese al siguiente link ---->  https://drive.google.com/file/d/1Ctf9Th4cPxEJYoMg8ciFaz2RxYmeWB8f/view?usp=sharing  

Ademas se recomienda abrir el alchivo mediante la pagina web Draw.io

## 📌 Descripción del Proyecto

Este proyecto implementa un sistema de apuestas deportivas utilizando Programación Orientada a Objetos (POO) en Java.
Permite registrar jugadores, gestionar eventos deportivos y crear apuestas simples o múltiples mediante tickets.

El objetivo es modelar el funcionamiento básico de una casa de apuestas, aplicando conceptos como clases, herencia, composición y encapsulamiento.

---

## 🎯 Funcionalidades Principales

* ✅ Registro de jugadores con saldo
* ✅ Registro de eventos deportivos con cuotas
* ✅ Creación de apuestas (simples y múltiples)
* ✅ Generación de tickets de apuesta
* ✅ Validación de saldo antes de apostar
* ✅ Cálculo de ganancias potenciales
* ✅ Consulta de tickets realizados

---

## 🧩 Estructura del Sistema

### 🔹 Clases Principales

* **CasaDeApuestas**

  * Gestiona jugadores, eventos y tickets.

* **Jugador**

  * Representa al usuario que realiza apuestas.

* **EventoDeportivo**

  * Contiene la información del evento y sus cuotas.

* **TicketApuesta**

  * Representa una apuesta completa (puede tener varias líneas).

* **LineaApuesta**

  * Representa una selección específica dentro de un ticket.

---

### 🔹 Jerarquía de Apuestas

* **Apuesta (Abstracta)**

  * Define el comportamiento general.

* **ApuestaSimple**

  * Apuesta a un solo evento.

* **ApuestaMultiple**

  * Apuesta a varios eventos (cuotas combinadas).

---

### 🔹 Enumeración

* **TipoPronostico**

  * Define los posibles resultados:

    * LOCAL
    * EMPATE
    * VISITANTE

---

## 🔗 Relaciones UML Implementadas

* 🔸 **Composición**

  * TicketApuesta → LineaApuesta
    (Las líneas no existen sin el ticket)

* 🔸 **Agregación**

  * CasaDeApuestas → Jugador / Evento / Ticket

* 🔸 **Herencia**

  * ApuestaSimple y ApuestaMultiple heredan de Apuesta

* 🔸 **Asociación**

  * Jugador ↔ Ticket
  * Evento ↔ Línea

---

## ⚙️ Funcionamiento General

1. Se registra un jugador con saldo.
2. Se crean eventos deportivos con cuotas.
3. El jugador selecciona un evento y un pronóstico.
4. Se crea una línea de apuesta.
5. Se agrupan líneas en un ticket.
6. Se calcula la ganancia potencial.
7. Se descuenta el saldo del jugador.

---

## 🛠️ Tecnologías Utilizadas

* Java
* Programación Orientada a Objetos
* UML (PlantUML para diagramas)

---

## 🚀 Ejecución del Proyecto

1. Compilar las clases:

   ```bash
   javac *.java
   ```

2. Ejecutar el programa:

   ```bash
   java Main
   ```

---

## 🧠 Conceptos Aplicados

* Encapsulamiento
* Herencia
* Polimorfismo
* Composición
* Manejo de errores (`try-catch`)
* Uso de colecciones (`ArrayList`)

---

## 👨‍💻 Autor

Airann Estiben Yepes Barrera.

