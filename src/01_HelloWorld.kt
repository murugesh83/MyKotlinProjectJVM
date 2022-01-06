import com.RepoResult
import com.google.gson.Gson
import org.json.JSONArray
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.MalformedURLException
import java.net.URL
import javax.net.ssl.HttpsURLConnection
import org.json.JSONObject

//It my kotlin com.kotlin.program.main method
fun main(arg : Array<String>){

    println("Hello World Kotlin")
    println(10*9)
    println(10+9)
    println(10/9)
    println(10.0/9)

    //var data = Name.getJSON("https://api.jikan.moe/v3/search/anime?q=naruto")
   // Name.run()
   // println()

}

object Name{

    fun getJSON(url: String?): String? {
        var con: HttpsURLConnection? = null
        try {
            val u = URL(url)
            con = u.openConnection() as HttpsURLConnection
            con.connect()
            val br = BufferedReader(
                InputStreamReader(
                    con!!.inputStream
                )
            )
            var line: String? =""
            if(br != null){
               line = br.readLine()
               // println("${br.readLine()}")
            }

           /* var jsonArray = JSONArray(line)
            for (jsonIndex in 0..(jsonArray.length() - 1)) {
               // Log.d("JSON", jsonArray.getJSONObject(jsonIndex).getString("title"))
               // println(jsonArray.getJSONObject(jsonIndex).getString("results"))
            }*/
            val sb = StringBuilder()
            println("Hellow")
            br.readLine().also { line = it }
            sb.append("$line")
            if(br.readLine() != null){
                println("Hellow")
            }else
            {
                println("Hellow else part")
            }
            while (br.readLine()!= null) {
                println("Hellow")
                br.readLine().also { line = it }
                sb.append("$line")
                println(sb)
            }

            br.close()
            return sb.toString()
        } catch (ex: MalformedURLException) {
            ex.printStackTrace()
        } catch (ex: IOException) {
            ex.printStackTrace()
        } finally {
            if (con != null) {
                try {
                    con.disconnect()
                } catch (ex: Exception) {
                    ex.printStackTrace()
                }
            }
        }
        return null
    }

    //2
    fun run(): RepoResult {
        //3
        val repoListJsonStr = URL("https://api.jikan.moe/v3/search/anime?q=naruto").readText()
        return Gson().fromJson(repoListJsonStr,RepoResult::class.java)
        //return "";
    }
}

