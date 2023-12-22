package lesson19_Object_Clone;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {

        // create 100 clones of Agent

        Agent agent = new Agent("Mr Smith");

        Agent clone = (Agent) agent.clone();
        System.out.println(agent);
        System.out.println(clone);

        Agent[] agents = make100Clones(agent);
        for (Agent clones: agents){
            System.out.println(clones);
        }

    }

    // create method of creating clones

    public static Agent[] make100Clones(Agent agent) throws CloneNotSupportedException {

        Agent[] agents = new Agent[100];
        for (int i = 0; i < 100; i++) {
            agents[i] = (Agent) agent.clone();
        }
return agents;
    }
}
