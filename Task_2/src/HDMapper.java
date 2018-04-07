package HardDiskAnalysis;


import java.io.IOException;
import java.util.*;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.*;

public class HDMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> {

	public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException {

		String valueString = value.toString();
		String[] SingleHardDiskData = valueString.split(",");

   // when failure = 1 i.e the last day of harddisk.
   if (SingleHardDiskData[4].equals("1")){
     
     output.collect(new Text(SingleHardDiskData[2]), new IntWritable(Integer.parseInt(SingleHardDiskData[20])));
   }

	}
}
