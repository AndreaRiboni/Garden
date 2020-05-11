package flower_logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Enum of flower colors
 * @author Andrea Riboni
 */
public enum Color {
  YELLOW ("#F6FF05"),
  RED ("#FF2B05"),
  WHITE ("#FFFFFF"),
  ORANGE ("#FFB005"),
  GREEN ("#38E330"),
  PINK ("#F5B9E1"),
  BLUE ("#3C56F7"),
  PURPLE ("#AF5582"),
  BLACK ("#000000");
  
  final String rgb;
  private static final List<Color> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
  private static final int SIZE = VALUES.size();

  private Color(String rgb){
    this.rgb = rgb;
  }
  
  /**
   * Get a random color
   * @return 
   */
  public static Color getRandom()  {
    return VALUES.get((int)(Math.random() * SIZE));
  }
}