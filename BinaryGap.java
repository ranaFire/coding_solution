class BinaryGap {
     public static int solution(int N) {      
    	 List<String>result = Arrays.asList(Integer.toBinaryString(N).replace("0"," ").strip().split("1")); 
    	 if(!result.isEmpty()) {
    	 return Collections.max(result.stream().map(String::length).collect(Collectors.toList()));
    	 }     	 
     return 0;   
 }
