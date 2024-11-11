package dev.trindadedev.swupdater.ui.screens.github.repository

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

import dev.trindadedev.swupdater.utils.SwLog
import dev.trindadedev.swupdater.ui.screens.github.models.Commit

class GitHubCommitsRepository(
  val client: HttpClient
) {
  
  suspend fun getCommits(
    owner: String,
    repo: String
  ): List<Commit> {
    return try {
      val url = "${Consts.BASE_URL}/$owner/$repo/commits"
      SwLog.d(message = "URL: ${url}")
      val response: List<Commit> = client.get(url).body()
      SwLog.d(message = "Response: ${response.toString()}")
      response
    } catch (e: Exception) {
      emptyList()
    } finally {
      client.close()
    }
  }
}