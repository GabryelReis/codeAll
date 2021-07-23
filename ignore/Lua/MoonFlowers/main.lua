function love.load()

player = {}

player.x = 300
player.y = 350
player.alt = 50
player.lar = 50

GRAV = 100
PULO = -200
alt_pulo = 20

end

function love.update(dt)
  
  player.y = player.y + GRAV * dt
  
  if love.keyboard.isDown("space") then
    player.y = player.y + PULO * dt
  end

end

function love.draw()
  love.graphics.rectangle("fill", player.x, player.y, player.lar, player.alt)
end