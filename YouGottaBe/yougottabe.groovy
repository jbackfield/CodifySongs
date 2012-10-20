
def Together = { -> "together" }
def gotta = new You() 
def you = {f -> f}

class You {
  private def properties = [:]
  def propertyMissing(String name, value) { this.properties[name] = value; }
  def propertyMissing(String name) { this.properties[name] = true; }
  def stay = { b -> this.stay = b }
  def be = { block -> this.with block }
}

you gotta be {
  bad
  bold
  wiser
  hard
  tough
  stronger
  cool
  calm
  stay Together
}
