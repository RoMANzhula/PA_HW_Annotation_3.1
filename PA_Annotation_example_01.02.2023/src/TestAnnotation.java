//import java.lang.annotation.*;

import java.lang.annotation.*;

@Inherited // вказує на те, що новостворена анотація буде передаватися по спадщині
@Target(value = {ElementType.TYPE, ElementType.FIELD, ElementType.METHOD}) // вказує, до яких елементів класу можна застосовувати анотацію: типи, поля, методи.
//@Target(value = ElementType.METHOD) // вказує, що анотація застосовується лише до методів
//що можна анотуючи ElementType:
//ANNOTATION_TYPE - анотації
//CONSTRUCTOR - конструктори
//FIELD - поля
//LOCAL_VARIABLE - локальні змінні
//METHODS - методи
//PACKAGE - пакети (дуже рідкісна ситуація)
//PARAMETER - параметри
//TYPE - типи (класи, інтерфейси, енуми)

@Retention(value = RetentionPolicy.RUNTIME) // тип анотації, в даному випадку РАНТАЙМ (це означає, що вона буде доступна для рефлексії)
//RetentionPolicy.CLASS - для сторонніх інструментів
//RetentionPolicy.RUNTIME - доступна для рефлексії
//RetentionPolicy.SOURCE - для компілятора

public @interface TestAnnotation {
    String parameter1(); // параметр анотації
}
