package flower.store;

import java.util.ArrayList;

public class Store {
    ArrayList<FlowerBucket> storeBuckets = new ArrayList<>();

    //search and return all buckets with given flowers(like arraylist)
    public ArrayList<FlowerBucket> searchbucket(FlowerType flowers) {
        ArrayList<FlowerBucket> possiblebucket = new ArrayList<>();
        for (FlowerBucket bucket:storeBuckets) {
            if (bucket.contains(flowers)) {
                possiblebucket.add(bucket);
            }
        }
        return possiblebucket;
    }

    public void addbucket(FlowerBucket bucket) {
        storeBuckets.add(bucket);
    }
}
