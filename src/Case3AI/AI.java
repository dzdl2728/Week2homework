package Case3AI;

public class AI {
    public String ans(String que){
        String ret =null;
        ret = handleCanStart(que);
        if(ret!=null){
            return ret;
        }
        ret = handleAskTail(que);

        if(ret!=null){
            return ret;
        }
        return handleUnknown(que);
    }

    private String handleCanStart(String que){
        String[] canStart = new String[]{"会", "能", "有", "敢", "在"};
        for (int i = 0; i < canStart.length; i++) {
            if (que.startsWith(canStart[i])){
                return canStart[i] + "！";
            }
        }
        return null;
    }
    private String handleAskTail(String que) {
        String[] askTail = new String[]{"吗？", "吗?", "吗"};
        for (int i = 0; i < askTail.length; i++) {
            if (que.endsWith(askTail[i])) {
                return que.replace(askTail[i], "！");
            }
        }
        return null;
    }

    private String handleUnknown(String que) {
        return que + "!";
    }

}
