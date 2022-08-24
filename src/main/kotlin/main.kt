fun main() {
    //Вместо рублей в качестве значений используем копейки
    val commissionPercentage = 0.0075 //Комиссия 0,75%
    val commissionMinTax = 3500 //Комиссия не менее 35руб
    val amount = 90_000_00 //Допустим 90к рублей
    val commission = if (amount * commissionPercentage < commissionMinTax) commissionMinTax else (amount * commissionPercentage).toInt()
    /*
        В реальных условиях переменные amount и commission следовало бы объявлять через var
        Но здесь пользовательского ввода нет и они изменяться не будут
     */
    println(commission) //Вывод на экран по условию не требуется, но пусть будет...
}