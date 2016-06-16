package me.reminisce.model

import me.reminisce.server.domain.RestMessage
import me.reminisce.statistics.StatisticEntities._
import com.github.nscala_time.time.Imports._

object RetrievingMessages {
  //Sent by the client
  case class RetrieveStats(
    userID: String, 
    frequency: List[(String, Int)], 
    allTime: Boolean) 
  extends RestMessage
  //Sent by the service
  case class RetrieveLastStatistics(userID: String) extends RestMessage
  case class GetFirstPlayDate(userID: String)
  //Sent by the worker
  case class StatisticsRetrieved(stat: StatResponse) extends RestMessage
  case class StatisticsNotFound(message: String) extends RestMessage    
  case class FirstPlayDate(date: DateTime)
  }
