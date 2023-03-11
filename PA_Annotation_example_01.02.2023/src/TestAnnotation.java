//import java.lang.annotation.*;

import java.lang.annotation.*;

@Inherited //говорит о том, что новая созданная аннотация будет передаваться по наследству
@Target(value = {ElementType.TYPE, ElementType.FIELD, ElementType.METHOD}) //указывает к каким членам класса мы можем
// аннтоцацию применять, для типа, поля, метода.
//@Target(value = ElementType.METHOD) //указывает что аннотация применяется только к методу
//что можно аннотировать ElementType:
//ANNOTATION_TYPE - аннотации
//CONSTRUCTOR - конструкторы
//FIELD - поля
//LOCAL_VARIABLE - локальные переменные
//METHODS - методы
//PACKAGE - пакеты (очень редкая ситуация)
//PARAMETER - параметры
//TYPE - типы (клас, интерфейс, энум)

@Retention(value = RetentionPolicy.RUNTIME)// тип аннотации, в данном случае РАНТАЙМ (это значит она будет доступна для Рефлексии)
//RetentionPolicy.CLASS - для сторонних инструментов
//RetentionPolicy.RUNTIME - доступный для Рефлексии
//RetentionPolicy.SOURCE - для компилятора

public @interface TestAnnotation {
    String parameter1();
}
