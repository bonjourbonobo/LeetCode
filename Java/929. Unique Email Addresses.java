class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set<String> set = new HashSet<String>();
        
        for(String email : emails){
            String[] separate = email.split("@");
            String local = separate[0];
            String domain = separate[1];
            // System.out.println("domain " + domain);
            
            local = local.replaceAll("\\.", "");
            // System.out.println("local2 " + local);
            
            int index = local.indexOf("+");
            if(index > 0){
                local = local.substring(0, index);
            }
            // System.out.println("local3 " + local);
            
            set.add(local+"@"+domain);
            
        }
        // System.out.println("######" + set.toString());
        return set.size();
        
    }
}


