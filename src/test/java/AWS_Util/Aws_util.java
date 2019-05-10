package AWS_Util;

import java.io.File;
import java.io.IOException;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.transfer.MultipleFileUpload;
import com.amazonaws.services.s3.transfer.TransferManager;

import Lib.Lib;

public class Aws_util {
	
	public static void uploadResultsToS3Bucket(String directoryPath) throws IOException {
		
		String awsPropPath = "/Users/sami/Desktop/eclipse-workspace2k19/RegresAPI_Testing/src/resources/java/properties/awsCred.properties";
		String accessKey = Lib.readproperties("accessKey",awsPropPath);
		String secretKey = Lib.readproperties("secretAccessKey", awsPropPath);
		
		BasicAWSCredentials awsCreds = new BasicAWSCredentials(accessKey,secretKey);		
		//AmazonS3Client s3Client = new AmazonS3Client(awsCreds);

		String bucketName = "sami1556332861486";
		String key_prefix = "TestData";
		boolean recursive = false;
		TransferManager transfer = new TransferManager(awsCreds);
		
		MultipleFileUpload xfer = transfer.uploadDirectory(bucketName, key_prefix, new File(directoryPath),recursive);
		
		try {
			
			xfer.waitForCompletion();
			
		}catch(AmazonServiceException e) {
			
			System.out.println(e);
			
		}catch(AmazonClientException e) {
			
			System.out.println(e);
			
		}catch(InterruptedException e) {
			
			System.out.println(e);
			
		}
		
		
	}

}
