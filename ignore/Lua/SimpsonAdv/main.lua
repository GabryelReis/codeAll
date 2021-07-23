function love.load()
  source = love.audio.newSource("music/simpson_gamer.WAV", "stream")
  source:setVolume(0.3)
  
  kiss = {}
  kiss.x = 300
  kiss.y = 400
  kiss.wigth = 50  
  kiss.height = 50
end

function love.update(dt)
  if not source:isPlaying( ) then
		love.audio.play( source )
  end

  if love.keyboard.isDown("up") then
    kiss.y = kiss.y - 250 * dt
 end
   if love.keyboard.isDown("down") then
    kiss.y = kiss.y + 250 * dt
 end
   if love.keyboard.isDown("left") then
    kiss.x = kiss.x - 250 * dt
 end
   if love.keyboard.isDown("right") then
    kiss.x = kiss.x + 250 * dt
 end
end

function love.draw()
  kiss.player = love.graphics.newImage("sprites/player.png")
  love.graphics.draw(kiss.player, kiss.x, kiss.y);
  love.graphics.print('CHURRASCO DE TATU', 200, 200)
end
