package HardDiskAnalysis;


import java.io.IOException;
import java.util.*;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.*;

public class HDReducer extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable>{

  public void reduce(Text t_key, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException {
    Text key = t_key;
    int maxLife = 0;
    int tempMaxLife;
    while (values.hasNext()){

      // replace type of value with the actual type of value of our value
      IntWritable value = (IntWritable) values.next();
      tempMaxLife = value.get();
      if (maxLife < tempMaxLife)
      {
        maxLife = tempMaxLife;
      }
    }
    output.collect(key, new IntWritable(maxLife));
  }
}
