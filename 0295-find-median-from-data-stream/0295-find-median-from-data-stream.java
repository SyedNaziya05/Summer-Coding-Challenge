class MedianFinder {
    private PriorityQueue<Integer> small; // max-heap, lower half
    private PriorityQueue<Integer> large; // min-heap, upper half

    public MedianFinder() {
        small = new PriorityQueue<>(Collections.reverseOrder());
        large = new PriorityQueue<>();
    }

    public void addNum(int num) {
        small.offer(num);

        // make sure every element in small <= every element in large
        large.offer(small.poll());

        // balance sizes: small can have at most one more than large
        if (small.size() < large.size()) {
            small.offer(large.poll());
        }
    }

    public double findMedian() {
        if (small.size() > large.size()) {
            return small.peek();
        }
        return (small.peek() + large.peek()) / 2.0;
    }
}