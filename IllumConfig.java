package illumsearch;

public class IllumConfig {
	
    public final int Algo_MapElites = 1;
    public final int Algo_Shine = 2;
	
    //Config options for each run
    public final int config_runType_JEvsBC	= 1;
    public final int config_runType_JEvsWidth	= 2;
    public final int config_runType_JEvsSpeed	= 3;
    public final int config_runType_JEvsContig	= 4;
    public final int config_runType_SpeedvsContig = 5;
    
    //Level parameters for map generation
    public final float config_map_minBC = 200f;
    public final float config_map_maxBC = 550f; 
    public final float config_map_minLW = 50;
    public final float config_map_maxLW = 150;
    public final float config_map_minJE = 0.01f;
    public final float config_map_maxJE = 0.2f;
    public final float config_map_minSpeed = 0.07f;
    public final float config_map_maxSpeed = 0.18f;
    public final float config_map_minRTime = 0.0f;
    public final float config_map_maxRTime = 30.0f;
    public final float config_map_minContig = 100f;
    public final float config_map_maxContig = 1000f;
    public final float config_map_fitnessThresshold = 1.00f;
    
    //Parameters for each level run
    public final int ticksPerRun = 100;
    
    //Mutation chances - Shared between both ME and SHINE
    public final float Dupe_Remove_Chance = 0.5F;
    public final float Tile_Mutation_Chance = 0.005F;
    public final float Crossover_Chance = .2F;
    
    //Parameters for generating random noise levels
    public final float max_tile_chance = 0.3f;
    public final int fixed_width = 100;
    
    //SHINE Variables
    public final int Generation_Size = 20;
    public final int Max_Tree_Depth = 6;
    public final int Max_Vertex_Reps = 10;
    
    //Size of Map Elites map (Maps always square)
    public final int mapSize = 10;
    
    //Seed used for generating initial population
    public final int initialSeed = 100;
    
    
    

}