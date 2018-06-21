package com.migu.schedule.info;

/**
 * 任务状态信息类，请勿修改。
 *
 * @author
 * @version
 */
public class TaskInfo
{
    private int taskssId;
    private int nodeId;
    public int getNodeId()
    {
        return nodeId;
    }
    public int getTaskssId(){  return taskssId; }
    public void setNodeId(int nodeId)
    {
        this.nodeId = nodeId;
    }
    public void setTaskssId(int taskssId)
    {
        this.taskssId = taskssId;
    }
    @Override
    public String toString()
    {
        return "TaskInfo [taskId=" + taskssId + ", nodeId=" + nodeId + "]";
    }
}
