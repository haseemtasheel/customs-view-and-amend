/*
 * Copyright 2022 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package models.file_upload

import models.C285FileSelection
import play.api.libs.json.{Json, OFormat}


case class UploadDocumentsConfig(
                                  nonce: Nonce,
                                  continueUrl: String,
                                  backlinkUrl: String,
                                  callbackUrl: String,
                                  continueAfterYesAnswerUrl: Option[String] = None,
                                  continueWhenFullUrl: Option[String] = None,
                                  continueWhenEmptyUrl: Option[String] = None,
                                  minimumNumberOfFiles: Option[Int] = None,
                                  maximumNumberOfFiles: Option[Int] = None,
                                  initialNumberOfEmptyRows: Option[Int] = None,
                                  maximumFileSizeBytes: Option[Long] = None,
                                  allowedContentTypes: Option[String] = None,
                                  cargo: UploadCargo,
                                  allowedFileExtensions: Option[String] = None,
                                  newFileDescription: C285FileSelection,
                                  content: Option[UploadDocumentsContent] = None,
                                  features: Option[UploadDocumentsFeatures] = None
                                )

object UploadDocumentsConfig {
  implicit val format: OFormat[UploadDocumentsConfig] = Json.format[UploadDocumentsConfig]
}

