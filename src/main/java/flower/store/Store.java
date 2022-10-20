package flower.store;

import java.util.ArrayList;

public class Store {
    ArrayList<FlowerBucket> StoreBuckets= new ArrayList<>();

    //search and return all buckets with given flowers(like arraylist)
    public ArrayList<FlowerBucket> search_bucket(FlowerType flowers){
        ArrayList<FlowerBucket> possible_bucket = new ArrayList<>();
        for(FlowerBucket bucket:StoreBuckets){
            if (bucket.contains(flowers)){
                possible_bucket.add(bucket);
            }
        }
        return possible_bucket;
    }

    public void add_bucket(FlowerBucket bucket){
        StoreBuckets.add(bucket);
    }
}
