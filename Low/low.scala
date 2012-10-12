trait Pants {}
object AppleBottomJeans extends Pants {}

trait Shoes {}
trait Fur {}
class Boots extends Shoes {}

trait ClubGoer {}
object WholeClub extends ClubGoer {}

trait Destination {}
object Floor extends Destination {}

trait Distance {}
class Low(d : Option[Distance] = None) extends Distance {}
object Standing extends Distance {}
object Low {
  def apply(dist : Distance) : Distance = {
    new Low(Some(dist))
  }
}

class Shawty(pants : Option[Pants] = None, shoes : Option[Shoes] = None , lookingAtHer : Option[ClubGoer] = None, dest : Option[Destination] = None) extends ClubGoer {
  def hadThem(pants : Pants) : Shawty = new Shawty(Some(pants), shoes, lookingAtHer, dest)
  def the(shoes : Shoes) : Shawty = new Shawty(pants, Some(shoes), lookingAtHer, dest)
  def lookingAtHer(who : ClubGoer) : Shawty = new Shawty(pants, shoes, Some(who), dest)
  def hitThe(dest : Destination) : Shawty = new Shawty(pants, shoes, lookingAtHer, Some(dest))
  def got(distance : Distance) : Shawty = new Shawty(pants, shoes, lookingAtHer, dest)
}

// new Shawty hadThem AppleBottomJeans the new Boots with Fur lookingAtHer WholeClub hitThe Floor got(Low(Low(Low(Low(Low(Low(Low(Standing))))))))
