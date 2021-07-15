--Estou aprendendo nesse momento o LOVE e Lua.
require("player")

function love.load()
 Player:load()
end

function love.update(dt)
 Player:update(dt)
end

function love.draw()
 Player:draw()
 love.graphics.print("Hello, world!", 350, 300)
end
