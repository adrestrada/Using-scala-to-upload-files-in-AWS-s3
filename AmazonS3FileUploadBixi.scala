package BucketsS3

import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.auth.BasicAWSCredentials
import java.io.File


object AmazonS3FileUpload extends App {

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ specifying bucket name
  val bucketName = "data-bucket"

  //file to upload
  val fileToUpload = new File("***************")

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~These Keys would be available to you in  "Security Credentials" of your Amazon S3 account
  val AWS_ACCESS_KEY = "***************"
  val AWS_SECRET_KEY = "**************"

  val yourAWSCredentials = new BasicAWSCredentials(AWS_ACCESS_KEY, AWS_SECRET_KEY)
  val amazonS3Client = new AmazonS3Client(yourAWSCredentials)

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~This will create a bucket for storage
  amazonS3Client.createBucket(bucketName)
  amazonS3Client.putObject(bucketName, "FileName", fileToUpload)
}
