package HardDiskAnalysis;


import java.io.IOException;
import java.util.*;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.*;

public class HDReducer extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable>{


  public void reduce(Text t_key, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException {
    Text key = t_key;
    int median = 0;
    // Define a list to store the life of hard disk
    ArrayList<Integer> hardDiskLifeList = new ArrayList<Integer>();

    while (values.hasNext()){
      // replace type of value with the actual type of value of our value
      IntWritable value = (IntWritable) values.next();
      hardDiskLifeList.add(value.get());
    }

    // Calculate median

    //// Sort the ArrayList
    Collections.sort(hardDiskLifeList);
    int size = hardDiskLifeList.size();

    if (size % 2 == 0){
      int half =  size /2 ;
      median = hardDiskLifeList.get(half);
    }
    else{
      int half = (size+1)/2;
      median = hardDiskLifeList.get(half-1);
    }
    // Collect Output
  
    output.collect(key, new IntWritable(median));
    hardDiskLifeList.clear();
  }
}
