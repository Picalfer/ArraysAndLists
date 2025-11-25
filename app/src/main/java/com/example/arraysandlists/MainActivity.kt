package com.example.arraysandlists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // массивы
        val number = 3
        val numbers = arrayOf(4, 52, "6", true) // так лучше не делать, иначе потом может
        // получиться перезаписать данные массива
        numbers[1] = 77
        val number0 = numbers[1]

        var numbers2: Array<Int> = arrayOf(3, 2, 1)
        numbers2 = arrayOf(3,2,1,4,2,4,5,2) // это не увеличение массива, удаляются старые значения
        // и записываются новые
        val numbers3: IntArray = intArrayOf(1,7,3,4) // просто другой способ объявления массива
        // *размер массива неизменяем

        val defaultArray = IntArray(3) // создает массив из 3-х элементов, где все
        // имеют значение по умолчанию(у Int это 0)

        val nullsArray = arrayOfNulls<Int>(5) // создается массив с 5 элементами значения null
        var noInitialArray = emptyArray<String>() // создание массива, которого можно
        // инициализировать позже
        noInitialArray = arrayOf("hello", "bye")

        numbers.reverse() // переворачивает массив
        val reversedNumbers = numbers2.reversedArray() // переворачивает массив,
        // но оригинальный остается не перевернутым
        Log.d("MyLog", "Number: ${numbers.contentToString()}")
        // contentToString() - позволяет взять в виде строки контент из массива
        Log.d("MyLog", "Number: ${reversedNumbers.contentToString()}")

        numbers2.sort() // сортирует от меньшего к большему
        val sortedArray = numbers3.sortedArray() // или можно создать новый, чтобы не вносить
        // изменения в старый
        sortedArray.sortDescending() // сортирует от большего к меньшему
        val descendingArray = sortedArray.sortedArrayDescending() // чтобы не трогать оригинальный
        Log.d("MyLog", "Number: ${descendingArray.contentToString()}")
        Log.d("MyLog", "Number: ${descendingArray.size}") // узнаем размер массива

        // еще есть много функций для массивов

        //списки
        val listNumbers = listOf(4,3,2,5,6) //в листе перезаписывать значения нельзя,
        // он только для считывания
        // к спискам есть все такие же функции как к массивам, только немного отличится
        // окончание названий функций
        val list1: List<Int> = listOf(3,1,34,1,2) // явно указываем
        val list2 = listOf<Int>(3,1,34,1,2) // так тоже можно явно указать, но смысла в этом нет
        // так как котлин самостоятельно определяет тип данных
        val arrayList: ArrayList<Int> = arrayListOf(4,3,5,2,5) // указание типа данных здесь
        // Не требуется. Такой список уже можно изменять
        arrayList[2] = 0
        arrayList.add(3043) // к такому arrayList можно добавлять элементы, но только типа данных
        // который установлен для этого arrayList
        arrayList.add(15)
        Log.d("MyLog", "Number: ${arrayList[arrayList.size - 1]}") // так можно взять
        // последний элемент
        arrayList.removeAt(3) // удалит элемент массива под индексом 3
        arrayList.clear() // очистка массива
        arrayList.addAll(listNumbers) // добавляет целый массив или список
        arrayList.addAll(numbers3.toList()) // превращаем массив в список чтобы далее добавить его
        Log.d("MyLog", "Number: ${arrayList[1]}")
    }
}