import java.text.SimpleDateFormat
import java.util.*

class Time {

    companion object {

        private val date = getCurrentDateTime()

        fun getCurrentDateTime(): Date {
            return Calendar.getInstance().time
        }

        private fun Date.toString(format: String, locale: Locale = Locale.getDefault()): String {
            val formatter = SimpleDateFormat(format, locale)
            return formatter.format(this)
        }


        val dateInString = date.toString("MMMM dd,yyyy")
        val timeInString = date.toString("HH:mm")

        //    lateinit var footerSetup: FooterSetup

        //        footerSetup = FooterSetup(binding.leftMenuLayout.footer, context, mainViewModel, shellViewModel)

    }

}