def Never = false

def Gonna = { value -> { -> value }}

class RickAstley {
  def giveYouUp = {f -> this.giveYouUp = f }
  def letYouDown = {f -> this.letYouDown = f }
  def runAroundAndDesertYou = {f -> this.runAroundAndDesertYou = f }
  def makeYouCry = {f -> this.makeYouCry = f }
  def sayGoodbye = {f -> this.sayGoodbye = f }
  def tellALieAndHurtYou = {f -> this.tellALieAndHurtYou = f }
  static def is(block) {
    def ra = new RickAstley()
    ra.with block
  }
}

RickAstley.is {
  giveYouUp Gonna (Never)
  letYouDown Gonna (Never)
  runAroundAndDesertYou Gonna (Never)
  makeYouCry Gonna (Never)
  sayGoodbye Gonna (Never)
  tellALieAndHurtYou Gonna (Never)
}
