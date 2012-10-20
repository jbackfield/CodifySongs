
def Together = { -> "together" }
def gotta = new You() 
def you = {f -> f}

class You {
  def bad = false
  def bold = false
  def wiser = false
  def hard = false
  def tough = false
  def stronger = false
  def cool = false
  def calm = false
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
