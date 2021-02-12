package demo.multiplat

import kotlin.browser.document

actual class Platform {
    actual val greetingMethod: String
        get() = "Console.log"
    actual val name: String
        get() = "JS"
}

actual fun getPlatform(): Platform {
    return Platform()
}
fun main() {
    getHtml()
}
fun getHtml() {
    val htmlString = """<div class="wrapper">
    <form action="">
        <div class="container">
            <div class="period-dates">
                <div class="period-from">
                    <input type="text" name="from-day" class="day">
                    <input type="text" name="from-month" class="month">
                    <input type="text" name="from-year" class="year">
                </div>
                <div class="period-to">
                    <input type="text" name="to-day" class="day">
                    <input type="text" name="to-month" class="month">
                    <input type="text" name="to-year" class="year">
                </div>
            </div>
            <div class="insurance-firm">
                <input type="text" name="insurance-subject" class="full-width">
            </div>
            <div class="insurance-object">
                <input type="text" name="insurance-object" class="full-width">
            </div>
            <div class="subject-phone">
                <input type="tel" name="subject-phone" maxlength="12">
            </div>
            <div class="transport-info">
                <input type="text" name="mark_and_model" class="mark">
                <input type="text" name="issue-year" class="issue-year">
                <input type="text" name="generator-number" class="generator-number">
                <input type="text" name="carcase-number" class="carcase-number">
                <input type="text" name="government-number" class="governtment-number">
            </div>
            <div class="subject-profession">
                <input type="text" name="subject-profession">
            </div>
            <div class="transport-users">
                <input type="text" name="transport-users">
            </div>
            <div class="users-can-drive">
                <div class="user-item">
                    <div class="fio">
                        <input type="text" name="user[0][first-name]">
                        <input type="text" name="user[0][last-name]">
                        <input type="text" name="user[0][third-name]">
                    </div>
                    <div class="driver-info">
                        <input type="text" name="user[0][serial]" class="serial">
                        <input type="text" name="user[0][number]" class="number">
                    </div>
                    <div class="relationship">
                        <input type="text" name="user[0][relationship]">
                    </div>
                </div>
                <div class="user-item">
                    <div class="fio">
                        <input type="text" name="user[1][first-name]">
                        <input type="text" name="user[1][last-name]">
                        <input type="text" name="user[1][third-name]">
                    </div>
                    <div class="driver-info">
                        <input type="text" name="user[1][serial]" class="serial">
                        <input type="text" name="user[1][number]" class="number">
                    </div>
                    <div class="relationship">
                        <input type="text" name="user[1][relationship]">
                    </div>
                </div>
            </div>
        </div>
    </form>
</div>"""


    val root = document.querySelector("[name=from-day]")
//    root!!.nodeValue = "dsa"
    root!!.innerHTML = htmlString

}